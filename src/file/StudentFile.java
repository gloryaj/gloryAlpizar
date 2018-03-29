package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.imageio.IIOException;
import domain.Student;

public class StudentFile {

    //atributos
    public RandomAccessFile randomAccessFile;
    private int regsQuantity; //cantidad de registros que tiene mi archivo
    private int regSize; //Tama;o en bytes de mis registros
    private String myFilePath; //Ruta del archivoden
   
    //constructor
    public StudentFile(File file) throws IIOException, FileNotFoundException, IOException {

         //guardar la ruta del archivo
        this.myFilePath = file.getPath();

        //tama;o maximo de cada registro en el archivo
        this.regSize = 1200 ;//yo decido de que tama;o

        //una validacion basica de file
        if (file.exists() && !file.isFile()) {
            throw new IIOException(file.getName() + "is an invalid file");
        } else {
            //crear una nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");
            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regSize);
        }
    }

   

    //metodo para insertar un estudiante en una posicion especifica
    public boolean putValue(int position, Student studentToInsert) throws IOException {
        //vamos hacer una peque;a va;idacion de position

        if (position >= 0 && position <= this.regsQuantity) {
            //verificar el tama;o sea el adecuado
            if (studentToInsert.sizeIntBytess() > this.regSize) {
                System.err.println("1002-records size is too large");
                return false;
            } else {

                //escribir archivo
                randomAccessFile.seek(position * this.regSize);//seek es el brazo
                randomAccessFile.writeUTF(studentToInsert.getName());
                randomAccessFile.writeUTF(studentToInsert.getId());
                randomAccessFile.writeUTF(studentToInsert.getCareer());
                randomAccessFile.writeInt(studentToInsert.getYear());
                randomAccessFile.writeUTF(studentToInsert.getCel());
                randomAccessFile.writeUTF(studentToInsert.getMail());
                randomAccessFile.writeUTF(studentToInsert.getDirection());
                return true;
            }

        } else {
            System.err.println("1001-position is out bounds"); //codigo para saber cual error es exactamente
            return false;
        }
    }//end method
//metodo para insertar al final del archivo

    public boolean addEndRecord(Student student) throws IOException {
        boolean success = putValue(this.regsQuantity, student);
        if (success) {
            ++this.regsQuantity;
        }
        return success;
    }

    //obtener un estudiante de una posicion especifica
    public domain.Student getStudent(int position) throws IOException {
        //validar position
        if (position >= 0 && position <= this.regsQuantity) {
            //colocar el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            //leer
            domain.Student studentTemp = new domain.Student();
            studentTemp.setName(randomAccessFile.readUTF());
            studentTemp.setId(randomAccessFile.readUTF());
            studentTemp.setCareer(randomAccessFile.readUTF());
            studentTemp.setYear(randomAccessFile.readInt());
            studentTemp.setCel(randomAccessFile.readUTF());
            studentTemp.setMail(randomAccessFile.readUTF());
            studentTemp.setDirection(randomAccessFile.readUTF());  
               
            if (studentTemp.getName().equals("deleted")) {
                return null;
            } else {
                return studentTemp;
            }
        } else {
            System.err.println("1003-position is out bounds");
            return null;
        }
    }//end method

    //metodo para retornar todos los estudiantes que estan dentro del archivo
    public ArrayList<domain.Student> getStudentList() throws IOException {

        //crear una instancia de una array list
        ArrayList<domain.Student> arrayListOfStudents = new ArrayList<>();

        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.regsQuantity; i++) {
            domain.Student studentTemp = this.getStudent(i);

            //insertar ese estudiante en la lista
            if (studentTemp != null) {
                arrayListOfStudents.add(studentTemp);
            }
        }
        return arrayListOfStudents;
    }

    public boolean deleteRecord(String name) throws IOException {
        domain.Student studentTemp;
        for (int i = 0; i < this.regsQuantity; i++) {
            studentTemp = this.getStudent(i);

            if (studentTemp.getName().equals(name)) {
                studentTemp.setName("delete");
                return this.putValue(i, studentTemp);
            }
        }
        return false;
    }//end method

}


