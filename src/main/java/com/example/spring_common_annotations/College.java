package com.example.spring_common_annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;




@Component("collegeBean")               // creates object, bean as in xml file. "collegeBean" is the beanID.  Default beanID is college
public class College
{
    private Principal principal;
    private Teacher teacher;
    private String collegeName;



    public College()
    {

    }

    public College(Principal principal)
    {
        this.principal = principal;
    }

    @Autowired
    public void setPrincipal(Principal principal)
    {
        this.principal = principal;
    }

    @Autowired
    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    @Value("${college.name}")
    public void setCollegeName(String collegeName)
    {
        this.collegeName = collegeName;
    }

    public void test()
    {
        System.out.println("testing this class method");
        principal.principalInfo();
        teacher.teach();
        System.out.println("college name: " + collegeName);
    }
}
