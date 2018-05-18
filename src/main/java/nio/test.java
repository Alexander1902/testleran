package nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class test {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\nio.txt");
		RandomAccessFile ran = new RandomAccessFile(file, "rw");
		FileChannel channel = ran.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(10);
		//CharBuffer buf = CharBuffer.allocate(100);
		int read = channel.read(buf);
		while(read!=-1){
			System.out.println("Read " + read);

			buf.flip();
			while(buf.hasRemaining()){
				System.out.println((char)buf.get());
			}
		
		buf.clear();
		read = channel.read(buf);
		}
		ran.close();
	}
}
