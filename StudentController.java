package com.javainuse.Controller;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import com.javainuse.data.StudentRepository;
import com.javainuse.model1.Student;

	@Controller
	public class StudentController  {

		@Autowired
		private StudentRepository studentData;

		@RequestMapping(value = "/addNewStudent.html", method = RequestMethod.POST)
		public String newStudent(Student student) {

			studentData.save(student);
			return ("redirect:/list.html");

		}

		@RequestMapping(value = "/addNewStudent.html", method = RequestMethod.GET)
		public ModelAndView addNewEmployee() {

			Student student = new Student();
			return new ModelAndView("newStudent", "form", student);

		}

		@RequestMapping(value = "/listStudents.html", method = RequestMethod.GET)
		public ModelAndView students() {
			List<Student> allstudents = studentData.findAll();
			return new ModelAndView("allstudents", "students", allstudents);

		}

	}

