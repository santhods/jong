package com.java.jong.DataStructure.Invoice;

import com.java.jong.UserInterface.JFrame.JFrameInvoiceViewer;
import com.java.jong.UserInterface.JPanel.JPanelInvoice;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

// this class is used for generating an invoice based on file and file path passes through class instance.
public class InvoiceGenerate {
    
    public InvoiceGenerate(String path){
        SwingController documentViewer = new SwingController();
        new JFrameInvoiceViewer(new JPanelInvoice(new SwingViewBuilder(documentViewer)).invoicePanel);
        documentViewer.openDocument(path);
    }
}
