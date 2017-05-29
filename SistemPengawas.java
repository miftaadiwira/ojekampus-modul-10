
/**
 * Ini adalah class Sistem Pengawas
 * Mengimplementasikan Runnable agar dapat menggunakan Thread
 * 
 * @author Mifta Adiwira
 * @version 26 Mei 2017
 */
public class SistemPengawas implements Runnable
{
    private Thread t;
    private String threadName;
    private boolean program_run;
    private int waktu_cek;
    
    public SistemPengawas(String name, int waktu_cek)
    {
        threadName = name;
        waktu_cek = waktu_cek;
        program_run = true;
        System.out.println("\nCreating " + threadName);
    }

    public void run()
    {
        System.out.println("Running " + threadName);        
        while(program_run==true)
        {
            try
            {
                Administrasi.jalankanSistemPenugas();
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread " + threadName + " interrupted.");
            }
            catch(NullPointerException pe)
            {
                exit();
            }
            System.out.println("Thread " + threadName + " exiting.");            
        }

    }
    
    public void start()
    {
        System.out.println("Starting " + threadName);  
        if(t==null)
        {
            t = new Thread(this);
            t.start();
        }
    }
    
    public void join() throws InterruptedException
    {   
        t.join();
    }
    
    public void exit()
    {
        program_run = false;
    }
}
