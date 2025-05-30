package com.yw.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.entities.JobSeeker;
import com.yw.service.IJobSeekerService;

@Component
public class JobSeekerRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekerService service;
	
	Scanner sc = new Scanner(System.in);
	JobSeeker js = new JobSeeker();
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("1. Register JobSeeker");
		System.out.println("2. Search JobSeeker");
		System.out.println("3. Exit");
		System.out.println("Enter your choice: ");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
			case 1:
				//1. register jobseeker
				System.out.println("Registration Process of JobSeeker...");
				System.out.println("Enter JobSeeker's Name: ");
				js.setName(sc.nextLine());
				System.out.println("Enter job role: ");
				js.setJobRole(sc.nextLine());
				System.out.println("Enter photo file path: ");
				String photoPath = sc.nextLine();
				System.out.println("Enter resume file path: ");
				String resumePath = sc.nextLine();
				System.out.println("Is JobSeeker is Indian? : ");
				js.setIndian(Boolean.parseBoolean(sc.nextLine()));
				System.out.println("Enter JobSeekers Phone-no: ");
				js.setPhone(Long.parseLong(sc.nextLine()));
				
				//prepare byte[] representing photo file content
				InputStream is = new FileInputStream(photoPath);
				byte[] photoData = new byte[is.available()];
				photoData = is.readAllBytes();
				js.setPhoto(photoData);
				
				//prepare char[] representing of resume file content
				File file = new File(resumePath);
				Reader reader = new FileReader(file);
				char[] resumeData = new char[ (int) file.length()];
				reader.read(resumeData);
				js.setResume(resumeData);
				
				String msg1 = service.registerJobSeeker(js);
				System.out.println("\n"+msg1);
				break;
				
			case 2:
				System.out.println("Enter JobSeeker Id: ");
				int id = Integer.parseInt(sc.nextLine());
				Optional<JobSeeker> opt = service.searchJobSeekerById(id);
				if(opt.isPresent()) {
					JobSeeker job = opt.get();
					System.out.println(job.getId()+"\nName: "+job.getName()+"\nJob Role: "+job.getJobRole()+"\nPhone: "+job.getPhone());
					OutputStream os = new FileOutputStream("D:\\images\\photo.jpg");
					os.write(job.getPhoto());
					os.flush();
					Writer writer = new FileWriter("D:\\Resume\\Biodata.txt");
					writer.write(job.getResume());
					writer.flush();
					os.close();
					writer.close();
					System.out.println("LOBs are retrived....");
//					System.out.println("");
				}else {
					System.out.println("JobSeeker not found.....");
				}
				break;
				
			case 3:
				System.exit(0);
				
			default:
				System.out.println("Invalic choice...");
		}
	}

}
