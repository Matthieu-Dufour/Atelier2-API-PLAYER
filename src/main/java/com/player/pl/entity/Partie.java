package com.player.pl.entity;

import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Partie { 
	
    @Id
    private String id;
    private String token;
    private String nb_photos;
    private String status;
    private String score;
	private String joueur;
	@CreationTimestamp
    private Date created;

    Partie(){
     //pour JPA	
    }

    public Partie(String token, String nb_photos, String status, String score, String joueur) {
        this.token = token;
        this.nb_photos = nb_photos;
        this.status = status;
        this.score = score;
        this.joueur = joueur;
    }

    public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getToken()
	{
		return this.token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	public String getNb_photos()
	{
		return this.nb_photos;
	}

	public void setNb_photos(String nb_photos)
	{
		this.nb_photos = nb_photos;
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getScore()
	{
		return this.score;
	}

	public void setScore(String score)
	{
		this.score = score;
	}

	public String getJoueur()
	{
		return this.joueur;
	}

	public void setJoueur(String joueur)
	{
		this.joueur = joueur;
	}

	public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
