
interface MovableObject {
    void moveIt ();
}

interface Spherical {
    void doSphericalThings();
}

interface Bounceable extends MovableObject,Spherical {
    void bounce();
}


public class Volleyball implements Bounceable{
    @Override
    public void moveIt() {}
    @Override
    public void doSphericalThings() {}
    @Override
    public void bounce() {}
}

abstract class BeachBall implements Bounceable {

}
