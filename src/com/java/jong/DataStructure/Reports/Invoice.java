/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.Reports;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.java.jong.DataStructure.Invoice.InvoiceGenerate;
import com.java.jong.DataStructure.Pathing.PathGenerator;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/* this class is used for designing, building an invoice layout, and display an invoice in the program
     based-on data passes through build method parameters.*/
public abstract class Invoice {
    
    private static String fileName,filePath; // file name and path.
    private static final String invoice = "Invoices"; // folder name for storing invoice files.

  // this method is used to build and display invoice the in system based-on information passes through the parameters.
    public static void build(  String customerName,
                                            String contactNumber,
                                            String reservedDate,
                                            String reservedTime,
                                            String reservedTable,
                                            String guests,
                                            Object[] foodList,
                                            Object[] drinkList
                                        )
    {
        try{
        fileName = ("Invoice_" + new SimpleDateFormat("ddMMyyyy-HHmmss").format(new Date()))+ ".pdf"; // generate automatic file name based-on date and time of creation.
        new File(PathGenerator.getHomePath() + System.getProperty("file.separator") + invoice).mkdir(); // create a directory for invoices folder.
        filePath =  Paths.get(PathGenerator.getHomePath(), System.getProperty("file.separator"), invoice).toString()
                     +  System.getProperty("file.separator") + fileName; // link file path name file together for the default file saving location.
 
        Document doc = new Document(); 
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(filePath));
         
        final int spacing = 10;
        final Font headFont = new Font(Font.FontFamily.TIMES_ROMAN,20, Font.BOLD);
        final Font labelsFont = new Font(Font.FontFamily.HELVETICA, 14, Font.NORMAL);
        final Font tableRowsFont = new Font(Font.FontFamily.COURIER, 14, Font.ITALIC);
        final Font tableHeaderFont = new Font(Font.FontFamily.COURIER, 14, Font.BOLD);
        final Font dateTimeFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.UNDERLINE);
        
        Paragraph contentParagraph = new Paragraph();
        Paragraph footParagraph = new Paragraph();
        
        // Add information about bookings
        Chunk customerNameChunk = new Chunk("Customer name:      " + customerName, labelsFont);
        Chunk contactNumberChunk = new Chunk("Contact number:        "+ contactNumber, labelsFont);
        Chunk reservedDateChunk = new Chunk("Reserved date:      "+ reservedDate, labelsFont );
        Chunk reservedTimeChunk = new Chunk("Reserved time:      "+  reservedTime, labelsFont );
        Chunk reservedTableChunk = new Chunk("Reserved table:        "+  reservedTable, labelsFont );
        Chunk noOfGuestsChunk = new Chunk("Number of guests:     "+ guests, labelsFont );
        Chunk foodItemsChunk = new Chunk("FoodItem", labelsFont );
        
        Chunk contents[] = {  customerNameChunk, contactNumberChunk, reservedDateChunk,
                                            reservedTimeChunk,  reservedTableChunk, noOfGuestsChunk, foodItemsChunk      };
        
        contentParagraph.setLeading(20);
        contentParagraph.setAlignment(Paragraph.ALIGN_LEFT);
        contentParagraph.setSpacingBefore(spacing);
        contentParagraph.setSpacingAfter(spacing);
        
        footParagraph.setSpacingAfter(20f);
        footParagraph.setSpacingBefore(20f);
        footParagraph.setAlignment(Paragraph.ALIGN_CENTER);
        for (int i = 0; i < 100; i++) footParagraph.add("-");
        
        
        // Table contents from food item;
            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100f);
            PdfPCell noCell= new PdfPCell(new Paragraph("No.", tableHeaderFont));
            PdfPCell itemCell= new PdfPCell(new Paragraph("Item", tableHeaderFont));
            PdfPCell quantityCell = new PdfPCell(new Paragraph("Quantity", tableHeaderFont));
            PdfPCell columns [] = { noCell, itemCell, quantityCell};
            
          int quan = 0; // the quantity of each food item
           for (PdfPCell column : columns) table.addCell(column); // add table header
           for (Object value : foodList) {
               table.addCell(new PdfPCell(new Phrase(String.valueOf(++quan), tableRowsFont)));
               table.addCell(new PdfPCell(new Phrase((String.valueOf(value)), tableRowsFont)));
               table.addCell(new PdfPCell(new Phrase("1", tableRowsFont)));
           }
           for (Object value : drinkList) {
               table.addCell(new PdfPCell(new Phrase(String.valueOf(++quan), tableRowsFont)));
               table.addCell(new PdfPCell(new Phrase((String.valueOf(value)), tableRowsFont)));
               table.addCell(new PdfPCell(new Phrase("1", tableRowsFont)));
           }

// add table rows
        
            writer.addViewerPreference(PdfName.FITWINDOW, null);
            //    writer.addViewerPreference(PdfName.CENTERWINDOW, null);
            
            doc.open();

                doc.add(new Paragraph("Invoice", headFont));
                doc.add(new Paragraph("Date " + new SimpleDateFormat("dd - MM - yyyy  HH:mm").format(new Date()), dateTimeFont));
                        for (Chunk content : contents) { 
                            contentParagraph.add(content);
                            doc.add(contentParagraph);
                            contentParagraph.clear();
                            }
                doc.add(table);
                doc.add(footParagraph);
                
        doc.close();
        
        // Document viewing process
        JOptionPane.showMessageDialog(null, LanguageLoader.Language("PRINTINST"), LanguageLoader.Language("PRINTDIALOG"), JOptionPane.INFORMATION_MESSAGE);
        new InvoiceGenerate(filePath);
        
        } catch (DocumentException|FileNotFoundException e){
            e.printStackTrace();
            // when file printing or generating occurs any error, the error message dialog appear.
            JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate, LanguageLoader.Language("INVOICEERRORMSG"), LanguageLoader.Language("INVOICEERROR"), JOptionPane.ERROR_MESSAGE);
        }
    }
}
