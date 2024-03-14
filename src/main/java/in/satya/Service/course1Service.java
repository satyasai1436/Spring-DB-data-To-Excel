package in.satya.Service;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.Entity.Course1;
import in.satya.Repo.course1Repo;

@Service
public class course1Service {

	@Autowired
	private course1Repo courseRepo;

	public void exportDataToExcel() throws Exception {
		List<Course1> courses = courseRepo.findAll();
		courses.forEach(System.out::println);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Courses_Info");

		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("ID");
		headerRow.createCell(1).setCellValue("Course");
		headerRow.createCell(2).setCellValue("Price");

		int rowNum = 1;
		for (Course1 course : courses) {
			Row dataRow = sheet.createRow(rowNum++);
			dataRow.createCell(0).setCellValue(course.getCid());
			dataRow.createCell(1).setCellValue(course.getcName());
			dataRow.createCell(2).setCellValue(course.getcPrice());
			rowNum++;
		}

		FileOutputStream outputStream = new FileOutputStream("C:\\ExcelFile\\course.xlsx");
		workbook.write(outputStream);
		workbook.close();

	}
}
