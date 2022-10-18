public class CircularLinkedList {
    int bilgi;

    public int getBilgi() {
        return bilgi;
    }

    public void setBilgi(int bilgi) {
        this.bilgi = bilgi;
    }
    Node ilk=null;
    Node son=null;
    public void Add(int bilgi)
    {
        Node yeni=new Node(bilgi);
        if (ilk ==null)
        {

            ilk=yeni;
        }
        else
            son.sonraki=yeni;
        son=yeni;
        son.sonraki=ilk;

    }
    public void Sil(int silinecek)
    {
        Node mevcut=ilk;
        if (ilk ==null)
            return;
        else
        {
            do {
                Node sonraki=mevcut.sonraki;
                if (sonraki.deger==silinecek)
                {
                    if (ilk==son)
                    {
                        ilk=null;
                        son=null;
                    }
                    else
                    {
                        mevcut.sonraki=sonraki.sonraki;
                        if (ilk==sonraki)
                            ilk=ilk.sonraki;
                        if(son==sonraki)
                            son=mevcut;
                    }
                }
                mevcut=sonraki;

            }while (mevcut!=ilk);
        }
    }
    public boolean Search(int aranan)
    {
        Node mevcut=ilk;
        if (ilk==null)
            return false;
        else
        {
            do {
                if (mevcut.deger==aranan)
                {
                    return true;
                }
                mevcut=mevcut.sonraki;

            }while (mevcut!=ilk);
        }
        return false;
    }
    public void List()
    {
        Node mevcut=ilk;
        if (ilk !=null)
        {
            do {
                System.out.print("->"+mevcut.deger);
                mevcut=mevcut.sonraki;

            }while (mevcut!=ilk);
        }
    }


}
