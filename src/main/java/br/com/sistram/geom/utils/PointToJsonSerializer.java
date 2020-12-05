package br.com.sistram.geom.utils;

import java.io.IOException;

import org.locationtech.jts.geom.Point;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class PointToJsonSerializer extends JsonSerializer<Point>{

	@Override
	public void serialize(Point value, JsonGenerator jgen, SerializerProvider arg2) throws IOException {
		String jsonValue = "null";
        try
        {
            if(value != null) {             
                double lat = value.getY();
                double lon = value.getX();
                jsonValue = String.format("LATLON (%s %s)", lat, lon);
            }
        }
        catch(Exception e) {}

        jgen.writeString(jsonValue);		
	}

}
