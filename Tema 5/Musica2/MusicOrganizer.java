package Musica2;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    public void listAllFiles(){
        for(String fileName : files){
            System.out.println(fileName);
        }
    }

    // listMaching
    public void listMaching(String match){

        boolean contain = false;

        for (String filename : getMaching(match)){
            System.out.println(filename);
            contain = true;
        }

        if (contain == false){
            System.out.println("Error, no se a encontrado ninguna archivo que contenaga: " + match);
        }
    }

    //playMaching

    public void playMaching(String match){
        for (String filename : getMaching(match)){

            if (filename.contains(match)){

                System.out.println(filename);
                this.player.playSample(filename);
            
            }
        }
    }

    //getMaching

    public ArrayList<String> getMaching(String match){
        ArrayList<String> cancionesMatch;
        
        cancionesMatch = new ArrayList<>();

        for (String filename : files){

            if (filename.contains(match)){

                cancionesMatch.add(match);
            
            }
        }

        return cancionesMatch;
    }

    //findFirst 

    public int findFirst(String searchString){
        boolean found = false;
        int cancionEncontrada = -1;
        int index = 0;  
        int longitudFiles = files.size();
        while (!found && index < longitudFiles)
        {
            if(this.files.get(index).contains(searchString))
            {
                found = true;
                cancionEncontrada = index;
            }   
            index++;
        }
        return cancionEncontrada;
    }
}   