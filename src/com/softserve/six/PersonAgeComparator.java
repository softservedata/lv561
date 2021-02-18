package com.softserve.six;

class StudentCoursComparator implements Comparator<Student>{
  
    public int compare(Student a, Student b){
      
        if(a.getCours()> b.getCours())
            return 1;
        else if(a.getCours()< b.getCours())
            return -1;
        else
            return 0;
    }
}