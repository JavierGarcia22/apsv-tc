package es.upm.dit.apsv.traceserver.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Trace {
    @Id
    private String traceId;
    private String truck;
    private long lastSeen;
    private double lat;
    private double lng;

    public Trace(String traceId, String truck, long lastSeen, double lat, double lng) {
        this.traceId = traceId;
        this.truck = truck;
        this.lastSeen = lastSeen;
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Trace)) {
            return false;
        }
        Trace trace = (Trace) o;
        return Objects.equals(traceId, trace.traceId) && Objects.equals(truck, trace.truck) && lastSeen == trace.lastSeen && lat == trace.lat && lng == trace.lng;
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, truck, lastSeen, lat, lng);
    }

}