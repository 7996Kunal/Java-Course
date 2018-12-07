
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
public class DataFromExcel 
{
    public static String[][] getData(String filename) throws Exception
    {
        File f=new File(filename);
        int size=(int)f.length();
        byte[] mydata=new byte[size];
        FileInputStream fin=new FileInputStream(filename);
        fin.read(mydata);
        Workbook workbook =new XSSFWorkbook(new ByteArrayInputStream(mydata));
        
        int numberOfSheets = workbook.getNumberOfSheets();
        Sheet sheet = workbook.getSheetAt(0);
        int n=sheet.getLastRowNum()+1;
        int m=sheet.getRow(0).getLastCellNum();
        String[][] exceldata=new String[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                try{
                        exceldata[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
                }catch(Exception ee){
                    exceldata[i][j]=sheet.getRow(i).getCell(j).getNumericCellValue()+"";
                }
            }
        }
        return exceldata;
    }
}
