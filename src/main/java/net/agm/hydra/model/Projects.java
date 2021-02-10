package net.agm.hydra.model;
// Generated 10-feb-2021 11.31.06 by Hibernate Tools 5.2.12.Final

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Projects generated by hbm2java
 */
@Entity
@Table(name = "projects")
public class Projects implements java.io.Serializable {

	private Long id;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private int totalDays;
	private Set<Tasks> taskses = new HashSet<Tasks>(0);

	public Projects() {
	}

	public Projects(Long id, String name, LocalDate startDate, LocalDate endDate, int totalDays) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalDays = totalDays;
	}

	public Projects(Long id, String name, String description, LocalDate startDate, LocalDate endDate, int totalDays,
			Set<Tasks> taskses) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalDays = totalDays;
		this.taskses = taskses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "start_date", nullable = false, length = 13)
	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Column(name = "end_date", nullable = false, length = 13)
	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Column(name = "total_days", nullable = false)
	public int getTotalDays() {
		return this.totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Tasks> getTaskses() {
		return this.taskses;
	}

	public void setTaskses(Set<Tasks> taskses) {
		this.taskses = taskses;
	}

}
