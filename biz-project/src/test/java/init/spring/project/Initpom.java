package init.spring.project;

import java.io.*;

/**
 * Created by 肖明明 on 2017/2/13.
 */
public class Initpom {

    public static void main(String[] args) {

        try {
            genarecMudolPom();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    
    public static void getPomMudoles(){
        File fileDir=new File("D:\\src\\spring-4.2.5");
        String[] sonFileList=fileDir.list();
        for(String fileName:sonFileList){
            if(new File("D:\\src\\spring-4.2.5\\"+fileName).isDirectory())
            System.out.println("<module>"+fileName+"</module>");
        }
    }
    
    public static void genarecMudolPom() throws IOException {
        File fileDir=new File("D:\\src\\spring-4.2.5");
        String[] sonFileList=fileDir.list();
        for(String fileName:sonFileList){
            File ff=new File("D:\\src\\spring-4.2.5\\"+fileName);
            if(ff.isDirectory()){
                //region pom content
                String pad="<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                        "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                        "    <modelVersion>4.0.0</modelVersion>\n" +
                        "    <parent>\n" +
                        "        <artifactId>spring-4.2.5</artifactId>\n" +
                        "        <groupId>org.xmm</groupId>\n" +
                        "        <version>4.2.5</version>\n" +
                        "    </parent>\n" +
                        "\n" +
                        "    <artifactId>"+fileName+"</artifactId>\n" +
                        "    <packaging>jar</packaging>\n" +
                        "\n" +
                        "    <name>"+fileName+"</name>\n" +
                        "    <url>http://maven.apache.org</url>\n" +
                        "\n" +
                        "    <properties>\n" +
                        "        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n" +
                        "    </properties>\n" +
                        "\n" +
                        "    <dependencies>\n" +
                        "\n" +
                        "       \n" +
                        "    </dependencies>\n" +
                        "</project>\n";
                //endregion
                
                File pomFile=new File("D:\\src\\spring-4.2.5\\"+fileName+"\\pom.xml");
                pomFile.createNewFile();
//                FileInputStream fis=new FileInputStream(pomFile);
                FileOutputStream fos=new FileOutputStream(pomFile);
                OutputStreamWriter osw=new OutputStreamWriter(fos);
                osw.write(pad);
                osw.flush();
                osw.close();
                fos.close();
                
            }
        }
        
        
        
        
        
        
        
    }
    
    
}
