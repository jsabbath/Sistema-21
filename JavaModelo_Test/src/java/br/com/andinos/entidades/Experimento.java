
package br.com.andinos.entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Experimento implements Serializable{
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Temporal(TemporalType.TIMESTAMP)
  private Date data = Calendar.getInstance().getTime();
  
  
  
  @ManyToOne
  private Ensaio ensaio;
  
}
