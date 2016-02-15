import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList <Membership> socios;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        socios = new ArrayList <Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership socio)
    {
        socios.add(socio);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socios.size();
    }
    
    /** 
    * Calcula el numero de socios que se dieron de alta en un mes determinado. 
    * El año no nos importa. En caso de que el parametro contenga un valor 
    * no valido se muestra por pantalla el error.
    * @param month El mes en el que estamos interesados
    * @return El numero de socios que se dieron de alta dicho mes
    */
    public int joinedMonth(int month)
    {
      int cont = 0;
      if (month > 12 || month<1)
      {
          System.out.println("Valor introducido no valido");
      }
      else
      {
          
          for (Membership member : socios )
          {
             if (member.getMonth() == month)
             {
               cont++;  
             }
          }
      }
      return cont;
    }
    
    /** 
 * Todos los socios que se han dado de alta un determinado mes de un determinado año se
 * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
 * por pantalla el error.
 * @param month El mes en el que estamos interesados
 * @param year El año en el que estamos interesados
 * @return Una coleccion con los socios que se han dado de baja del club
 */
 public  ArrayList<Membership> purge (int month, int year)
 {
     if (month > 12 || month<1)
     {
         System.out.println("Valor introducido no valido");
     }
     else
     {
        ArrayList<Membership> baneados = new ArrayList();
        Iterator<Membership> miembros = socios.iterator();
        while (miembros.hasNext()){
            Membership miembro = miembros.next();
            if (miembro.getMonth() == month && miembro.getYear() == year){
                baneados.add(miembro);
                miembros.remove();
            }   
      
         }
     }
       return socios;
 }























}





