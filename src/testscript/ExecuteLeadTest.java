package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

public class ExecuteLeadTest {
	
	@Test
	public void leadTest() throws IOException, InterruptedException {
		
		Keywords key = new Keywords();
		
		ArrayList arrayList = new ArrayList();
		
		FileInputStream file = new FileInputStream("C:\\Users\\user\\Desktop\\Pankaj_Java_Testing\\Automation_Testing\\CRM_Project\\LeadSuit.xlsx");
		XSSFWorkbook  workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("TestSteps");
		
		Iterator itr = sheet.iterator();
		while(itr.hasNext()) {
		    Row rowItr = (Row) itr.next();
		    Iterator cellItr = rowItr.cellIterator();
		    while(cellItr.hasNext()) {
		        Cell cellData = (Cell) cellItr.next();
		        switch (cellData.getCellType()) {
		            case STRING:
						arrayList.add(cellData.getStringCellValue());
						break;
		            case NUMERIC:
						arrayList.add(cellData.getNumericCellValue());
						break;
		            case BOOLEAN:
						arrayList.add(cellData.getBooleanCellValue());
						break;
	   	        }	
		    }
		}
		
		for(int i=0; i < arrayList.size(); i++) {
		    if(arrayList.get(i).equals("openbrowser")) {
		        
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        if(runmode.equals("yes")) {
		        	key.openbrowser();
		        }
	   	    }
		    
		    if(arrayList.get(i).equals("navigate")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	key.navigate(data);
		        }
	    	}
		    
		    if(arrayList.get(i).equals("input")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	key.input(data, objectName);
		        }
		    }
		    
		    if(arrayList.get(i).equals("click")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	key.click(objectName);
		        }
		    }
		    
		    if(arrayList.get(i).equals("verifyTitle")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	String actualValue = key.verifyTitle();
		        	
		        	Assert.assertEquals(data, actualValue);
		        }
		    }
		    
		    if(arrayList.get(i).equals("verifyPageText")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	String actualValue = key.verifyPageText(objectName);
		        	
		        	Assert.assertEquals(data, actualValue);
		        }
		    }
		    
		    if(arrayList.get(i).equals("verifyEditBox")) {
		    	
		    	String keyword = (String) arrayList.get(i);
		        String data = (String) arrayList.get(i + 1);
		        String objectName = (String) arrayList.get(i + 2);
		        String runmode = (String) arrayList.get(i + 3);
		        
		        System.out.println(keyword);
		        System.out.println(data);
		        System.out.println(objectName);
		        System.out.println(runmode);
		        
		        if(runmode.equals("yes")) {
		        	String actualValue = key.verifyEditBox(objectName);
		        	
		        	Assert.assertEquals(data, actualValue);
		        }
		    }
		    
		}
	}
}
