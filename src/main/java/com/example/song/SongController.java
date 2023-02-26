package com.example.song;
 
import org.springframework.web.bind.annotation.*;
import java.util.*;
  
import com.example.song.Song;
import com.example.song.SongService;

// Write your code here

@RestController
public class SongController{
    SongService ss = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return ss.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return ss.addSong(song);
    }
    
  @GetMapping("/songs/{songId}")
   public Song getSong(@PathVariable("songId") int songId){
        return ss.getSong(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song){
        return ss.updateSong(songId,song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        ss.deleteSong(songId);
    }
    
}