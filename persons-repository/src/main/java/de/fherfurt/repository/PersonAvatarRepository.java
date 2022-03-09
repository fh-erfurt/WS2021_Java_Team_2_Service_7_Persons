package de.fherfurt.repository;
import java.util.HashMap;
public class PersonAvatarRepository
{
    private static final PersonAvatarRepository AVATAR_REPOSITORY = new PersonAvatarRepository();
    private HashMap<Integer , byte[]> AvatarStorage = new HashMap<>();

    public void persistAvatarBy(int PersonID, byte [] AvatarByteArray) {
        AvatarStorage.put(PersonID, AvatarByteArray);
    }

    public byte[] getAvatarStorageBy(int PersonID) {
        return AvatarStorage.get(PersonID);
    }

    public static PersonAvatarRepository getInstance(){
        return AVATAR_REPOSITORY;
    }
}
