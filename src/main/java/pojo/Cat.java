package pojo;

import java.util.Objects;

public class Cat {
    private long id;
    private String nick;
    private String color;
    private String message;

    public Cat() {

    }

    public Cat(long id, String nick, String color, String message) {
        this.id = id;
        this.nick = nick;
        this.color = color;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && nick.equals(cat.nick) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nick, color);
    }
}
