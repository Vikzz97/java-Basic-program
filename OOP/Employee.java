class Employee{

    private int emp_id;
    public void setEmpid(int eid){
        emp_id = eid;
    }
    public int getEmpId(){
        return emp_id;
    }
}
class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpId());
    }
}
