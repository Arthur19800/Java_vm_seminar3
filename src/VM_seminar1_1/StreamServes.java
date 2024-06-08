package VM_seminar1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.io.*;

public class StreamServes extends StreamComparator{
    private String name;

    public StreamServes(String name) {
        this.name = name;
    }

    public LinkedList<Stream> streams = new LinkedList<>();
    public void addStream(Stream stream){
        streams.addLast(stream);
    }

    public List<Stream> getStreams() {
        return streams;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        for (Stream st: getStreams()){
            x= new StringBuilder( x+"nameStreamServes: "+ name +"\n" +st +"\n");
        }
        return x.toString();
    }

    @Override
    public int compare(Stream stream, Stream t1) {
        return super.compare(stream, t1);
    }
}
