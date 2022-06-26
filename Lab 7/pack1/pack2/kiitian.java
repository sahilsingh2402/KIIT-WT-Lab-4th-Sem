package pack1.pack2;

import pack1.student;

public class kiitian extends student {
    @Override
    protected void course() {
        System.out.println("Course Method Called!!!");
    }

    public int getroll() {
        return roll;
    }

    public int getreg() {
        return reg;
    }

    public void setroll(int roll) {
        this.roll = roll;
    }

    public void setreg(int reg) {
        this.reg = reg;
    }
}

class Test {
    public static void main(String[] args) {
        kiitian n = new kiitian();
        n.setreg(1045363);
        n.setroll(2005942);
        System.out.println("Roll no: " + n.getroll());
        System.out.println("Reg no: " + n.getreg());
        n.course();
    }
}


