package hillel.stolitnii.homeworks.homework13;

abstract class MusicStyles {
    public abstract String getBandName();
    public abstract String getMusicType();

    public void playMusic() {
        System.out.println(getBandName() + " виконує " + getMusicType() + " музику.");
    }
}

class PopMusic extends MusicStyles {
    @Override
    public String getBandName() {
        return "TemberBlanche";
    }

    @Override
    public String getMusicType() {
        return "поп";
    }
}

class RockMusic extends MusicStyles {
    @Override
    public String getBandName() {
        return "SystemOfADown";
    }

    @Override
    public String getMusicType() {
        return "рок";
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public String getBandName() {
        return "Ліндсі Стерлінг";
    }

    @Override
    public String getMusicType() {
        return "класичну";
    }
}

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}