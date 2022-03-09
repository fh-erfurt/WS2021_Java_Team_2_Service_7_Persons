package de.fherfurt.person;
import de.fherfurt.repository.PersonAvatarRepository;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;

public class PersonAvatar
{
    private byte [] AvatarByteArray;
    private final PersonAvatarRepository Repo = PersonAvatarRepository.getInstance();

    //Wieso throws IOException?
    public byte[] convertImageToByteArray(String ImagePath) throws IOException
    {
        //  "/home/hoang/Desktop/WS2021_Java_Team_2_Service_persons/Screenshot_20220228_155257.png";
        File UserAvatar = new File(ImagePath);
        return this.AvatarByteArray = Files.readAllBytes(UserAvatar.toPath());
    }

    public void setAvatarByteArrayIntoAvatarRepository(int PersonID)
    {
        Repo.persistAvatarBy(PersonID, AvatarByteArray);
    }
}
