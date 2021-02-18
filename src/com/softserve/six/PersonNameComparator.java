package com.softserve.six;

import java.util.List;

class StudentNameComparator implements Comparator<Student>{



    public int compare(Student a, Student b){
      
        return a.getName().compareTo(b.getName());
    }

//    public Comparator<Student> thenComparing(StudentCoursComparator studentCoursComparator) {
//    }
}