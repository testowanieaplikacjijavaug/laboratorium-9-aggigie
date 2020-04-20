package laboratorium.aggigie;

public interface IFriendsCollection {
    Person findByName(String name);
    void save(Person p);
}
