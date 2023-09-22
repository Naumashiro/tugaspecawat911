import greenfoot.*;

public class tower extends Actor 
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor pesawat = getOneIntersectingObject(pesawat.class);
        if (pesawat != null) {
            int pesawatX = pesawat.getX();
            int pesawatY = pesawat.getY();
            World world = getWorld(); 
            if (world != null) { 
                world.removeObject(this);
                world.addObject(new Boom(), pesawatX, pesawatY);
            }
        }
    }
}




