import java.sql.SQLOutput;

class MyArrayList {
    //属性
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 10;

    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }

    //方法
    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > usedSize) {
            System.out.println("该位置不合法");
        } else {
            for (int i = usedSize - 1; i >= pos; i--) {
                elem[i + 1] = elem[i];
            }
            elem[pos] = data;
            usedSize++;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                System.out.println("toFind ="+i);
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >  this.usedSize) {
            return -1;
        }
        for (int i = 0; i <this.usedSize; i++) {
            if(i==pos) {
                //System.out.println("pos = "+elem[i]);
                pos = elem[i];
            }
        }
          return pos;
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
    }

    // 获取顺序表长度
    public int size() {
        if(elem.length==0){
            return 0;
        }else {
            return elem.length;
        }
    }

    // 清空顺序表
    public void clear() {
        usedSize = 0;
    }
}


