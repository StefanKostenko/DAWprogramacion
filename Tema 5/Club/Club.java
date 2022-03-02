package Club;

import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    
    private static ArrayList<Membership> miembrosClub = new ArrayList<>();
    
    // Define any necessary fields here ...
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {

    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return miembrosClub.size();
    }

    public int joinedInMonth(int month){
        int contadorMiembros = 0;
        
        if(month > 1 && month < 12){
            for (Membership itemMember : miembrosClub) {
                if(itemMember.getMonth() == month){
                    contadorMiembros++;
                }
            }
        }else{
            System.out.println("El mes sale del rango del permitido el minimo es 1 y el maximo es el 12");
        }
        return contadorMiembros;
    }

    
}