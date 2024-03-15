package ch13.sec00;

public class Generic00 {
    public static void main(String[] args) {
        Box01 box01 = new Box01();
        box01.setItem("java");
        Object item = box01.getItem();
        if (item instanceof String) {
            String str = (String) item;
            System.out.println("String 일");
        }


        Box01 box01_1 = new Box01();
        box01_1.setItem(300);
        Integer item2 = (Integer) box01_1.getItem();

    }
}

class Box01 {
    private Object item;
    

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}