package animal;

public class Human extends Animal implements Thinkable{
    //趣味の追加
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
        //引数ありのコンストラクタの作成
    public Human(String name,int age,String hobby) {
        super(name,age);
        this.hobby = hobby;
    }
    //thinkのメソッド作成
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
    }

