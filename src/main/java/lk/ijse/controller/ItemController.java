package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.dto.CustomerDto;
import lk.ijse.dto.EmployeeDto;
import lk.ijse.dto.ItemDto;
import lk.ijse.model.CustomerModel;
import lk.ijse.model.EmployeeModel;
import lk.ijse.model.ItemModel;
import lk.ijse.tm.EmployeeTm;
import lk.ijse.tm.ItemTm;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    public TableView <ItemTm> OtherTM;

    @FXML
    public TextField MbBrand;

    @FXML
    public TextField MBqTy;

    @FXML
    public JFXComboBox<String> MBtype;

    @FXML
    public JFXComboBox<String> otherType;

    @FXML
    public TextField wheelQty;

    @FXML
    public TableView<ItemTm> wheelTm;

    @FXML
    private TextField AccBrand;

    @FXML
    private DatePicker AccDate;

    @FXML
    private TextField AccId;

    @FXML
    private TextField AccModel;

    @FXML
    private TextField AccPrice;

    @FXML
    private TextField AccQty;

    @FXML
    private JFXTextArea AccSpec;

    @FXML
    private TextField AccSupId;

    @FXML
    private JFXComboBox<String> AccType;

    @FXML
    private TextField AccYear;

    @FXML
    private TableView<ItemTm> AccessoriesTm;

    @FXML
    private TableView<ItemTm> CHtm;

    @FXML
    private TextField CasBrand;

    @FXML
    private DatePicker CasDate;

    @FXML
    private TextField CasId;

    @FXML
    private TextField CasModel;

    @FXML
    private TextField CasPrice;

    @FXML
    private TextField CasQty;

    @FXML
    private TextField CasSupId;

    @FXML
    private JFXComboBox<String> CasType;

    @FXML
    private TableView<ItemTm> CasingTm;

    @FXML
    private JFXTextArea Casspec;

    @FXML
    private TextField Casyear;

    @FXML
    private TableView<ItemTm> Gputm;

    @FXML
    private TableView<ItemTm> LapToptm;

    @FXML
    private DatePicker MBDate;

    @FXML
    private TextField MBId;

    @FXML
    private TextField MBmodelNo;

    @FXML
    private TextField MBprice;

    @FXML
    private JFXComboBox<String> MBqty;

    @FXML
    private JFXTextArea MBspec;

    @FXML
    private TextField MBsupID;

    @FXML
    private TableView<ItemTm> MBtm;

    @FXML
    private TextField MByear;

    @FXML
    private TableView<ItemTm> Ramtm;

    @FXML
    private TableView<ItemTm> UPStm;

    @FXML
    private JFXButton casingAddOnAction;

    @FXML
    private JFXButton casingDeleteOnAction;

    @FXML
    private JFXButton casingListOnAction;

    @FXML
    private JFXButton casingUpdateOnAction;

    @FXML
    private TextField chBrand;

    @FXML
    private DatePicker chDate;

    @FXML
    private TextField chID;

    @FXML
    private TextField chModel;

    @FXML
    private TextField chPrice;

    @FXML
    private TextField chQty;

    @FXML
    private JFXTextArea chSpec;

    @FXML
    private TextField chSupid;

    @FXML
    private JFXComboBox<String> chType;

    @FXML
    private TextField chYear;

    @FXML
    private TextField moniBrand;

    @FXML
    private DatePicker moniDate;

    @FXML
    private TextField moniID;

    @FXML
    private TextField moniModel;

    @FXML
    private TextField moniPrice;

    @FXML
    private TextField moniQty;

    @FXML
    private JFXTextArea moniSpec;

    @FXML
    private TextField moniSupID;

    @FXML
    private TableView<ItemTm> moniTm;

    @FXML
    private JFXComboBox<String> moniType;

    @FXML
    private TextField moniYear;

    @FXML
    private TextField odherYear;

    @FXML
    private TextField otherBrand;

    @FXML
    private DatePicker otherDate;

    @FXML
    private TextField otherModel;

    @FXML
    private TextField otherPrice;

    @FXML
    private TextField otherQty;

    @FXML
    private JFXTextArea otherSpec;

    @FXML
    private TextField otherSupId;

    @FXML
    private TextField otherid;

    @FXML
    private TextField stoBrand;

    @FXML
    private DatePicker stoDate;

    @FXML
    private TextField stoID;

    @FXML
    private TextField stoModel;

    @FXML
    private TextField stoPrice;

    @FXML
    private TextField stoQty;

    @FXML
    private JFXTextArea stoSpec;

    @FXML
    private TextField stoSupID;

    @FXML
    private JFXComboBox<String> stoType;

    @FXML
    private TextField stoYear;

    @FXML
    private TableView<ItemTm> storageTM;

    @FXML
    private TableColumn<?, ?> tmAccBrand;

    @FXML
    private TableColumn<?, ?> tmAccDate;

    @FXML
    private TableColumn<?, ?> tmAccId;

    @FXML
    private TableColumn<?, ?> tmAccModel;

    @FXML
    private TableColumn<?, ?> tmAccPrice;

    @FXML
    private TableColumn<?, ?> tmAccQty;

    @FXML
    private TableColumn<?, ?> tmAccSupId;

    @FXML
    private TableColumn<?, ?> tmAccType;

    @FXML
    private TableColumn<?, ?> tmAccYear;

    @FXML
    private TableColumn<?, ?> tmAccspec;

    @FXML
    private TableColumn<?, ?> tmCHid;

    @FXML
    private TableColumn<?, ?> tmCasingBrand;

    @FXML
    private TableColumn<?, ?> tmCasingDate;

    @FXML
    private TableColumn<?, ?> tmCasingId;

    @FXML
    private TableColumn<?, ?> tmCasingModel;

    @FXML
    private TableColumn<?, ?> tmCasingPrice;

    @FXML
    private TableColumn<?, ?> tmCasingQty;

    @FXML
    private TableColumn<?, ?> tmCasingSpec;

    @FXML
    private TableColumn<?, ?> tmCasingSupId;

    @FXML
    private TableColumn<?, ?> tmCasingType;

    @FXML
    private TableColumn<?, ?> tmCasingYer;

    @FXML
    private TableColumn<?, ?> tmChBrand;

    @FXML
    private TableColumn<?, ?> tmChDate;

    @FXML
    private TableColumn<?, ?> tmChModel;

    @FXML
    private TableColumn<?, ?> tmChPrice;

    @FXML
    private TableColumn<?, ?> tmChQty;

    @FXML
    private TableColumn<?, ?> tmChSpec;

    @FXML
    private TableColumn<?, ?> tmChSupId;

    @FXML
    private TableColumn<?, ?> tmChType;

    @FXML
    private TableColumn<?, ?> tmChYear;

    @FXML
    private TableColumn<?, ?> tmGpuBrand;

    @FXML
    private TableColumn<?, ?> tmGpuDate;

    @FXML
    private TableColumn<?, ?> tmGpuId;

    @FXML
    private TableColumn<?, ?> tmGpuModelNo;

    @FXML
    private TableColumn<?, ?> tmGpuPrice;

    @FXML
    private TableColumn<?, ?> tmGpuQty;

    @FXML
    private TableColumn<?, ?> tmGpuSpec;

    @FXML
    private TableColumn<?, ?> tmGpuSupId;

    @FXML
    private TableColumn<?, ?> tmGpuType;

    @FXML
    private TableColumn<?, ?> tmGpuYear;

    @FXML
    private TableColumn<?, ?> tmLapBrand;

    @FXML
    private TableColumn<?, ?> tmLapDate;

    @FXML
    private TableColumn<?, ?> tmLapId;

    @FXML
    private TableColumn<?, ?> tmLapModelNo;

    @FXML
    private TableColumn<?, ?> tmLapPrice;

    @FXML
    private TableColumn<?, ?> tmLapQty;

    @FXML
    private TableColumn<?, ?> tmLapSpec;

    @FXML
    private TableColumn<?, ?> tmLapSupName;

    @FXML
    private TableColumn<?, ?> tmLapType;

    @FXML
    private TableColumn<?, ?> tmLapYear;

    @FXML
    private TableColumn<?, ?> tmMBdate;

    @FXML
    private TableColumn<?, ?> tmMBid;

    @FXML
    private TableColumn<?, ?> tmMBmodelNo;

    @FXML
    private TableColumn<?, ?> tmMBprice;

    @FXML
    private TableColumn<?, ?> tmMBqty;

    @FXML
    private TableColumn<?, ?> tmMBrand;

    @FXML
    private TableColumn<?, ?> tmMBsupId;

    @FXML
    private TableColumn<?, ?> tmMBtype;

    @FXML
    private TableColumn<?, ?> tmMByear;

    @FXML
    private TableColumn<?, ?> tmMbspec;

    @FXML
    private TableColumn<?, ?> tmMoniBrand;

    @FXML
    private TableColumn<?, ?> tmMoniDate;

    @FXML
    private TableColumn<?, ?> tmMoniID;

    @FXML
    private TableColumn<?, ?> tmMoniModel;

    @FXML
    private TableColumn<?, ?> tmMoniPrice;

    @FXML
    private TableColumn<?, ?> tmMoniQty;

    @FXML
    private TableColumn<?, ?> tmMoniSpec;

    @FXML
    private TableColumn<?, ?> tmMoniSupID;

    @FXML
    private TableColumn<?, ?> tmMoniType;

    @FXML
    private TableColumn<?, ?> tmMoniYear;

    @FXML
    private TableColumn<?, ?> tmOtherBrand;

    @FXML
    private TableColumn<?, ?> tmOtherDate;

    @FXML
    private TableColumn<?, ?> tmOtherID;

    @FXML
    private TableColumn<?, ?> tmOtherModel;

    @FXML
    private TableColumn<?, ?> tmOtherPrice;

    @FXML
    private TableColumn<?, ?> tmOtherQty;

    @FXML
    private TableColumn<?, ?> tmOtherSpec;

    @FXML
    private TableColumn<?, ?> tmOtherSupId;

    @FXML
    private TableColumn<?, ?> tmOtherType;

    @FXML
    private TableColumn<?, ?> tmOtherYear;

    @FXML
    private TableColumn<?, ?> tmQty;

    @FXML
    private TableColumn<?, ?> tmRamBrand;

    @FXML
    private TableColumn<?, ?> tmRamDate;

    @FXML
    private TableColumn<?, ?> tmRamId;

    @FXML
    private TableColumn<?, ?> tmRamModel;

    @FXML
    private TableColumn<?, ?> tmRamPrice;

    @FXML
    private TableColumn<?, ?> tmRamSpec;

    @FXML
    private TableColumn<?, ?> tmRamSupId;

    @FXML
    private TableColumn<?, ?> tmRamType;

    @FXML
    private TableColumn<?, ?> tmRamYear;

    @FXML
    private TableColumn<?, ?> tmStoBrand;

    @FXML
    private TableColumn<?, ?> tmStoDate;

    @FXML
    private TableColumn<?, ?> tmStoID;

    @FXML
    private TableColumn<?, ?> tmStoModelNo;

    @FXML
    private TableColumn<?, ?> tmStoPrice;

    @FXML
    private TableColumn<?, ?> tmStoQty;

    @FXML
    private TableColumn<?, ?> tmStoSpec;

    @FXML
    private TableColumn<?, ?> tmStoSupID;

    @FXML
    private TableColumn<?, ?> tmStoType;

    @FXML
    private TableColumn<?, ?> tmStoYear;

    @FXML
    private TableColumn<?, ?> tmUPStype;

    @FXML
    private TableColumn<?, ?> tmUpsBrand;

    @FXML
    private TableColumn<?, ?> tmUpsDate;

    @FXML
    private TableColumn<?, ?> tmUpsId;

    @FXML
    private TableColumn<?, ?> tmUpsModel;

    @FXML
    private TableColumn<?, ?> tmUpsPrice;

    @FXML
    private TableColumn<?, ?> tmUpsQty;

    @FXML
    private TableColumn<?, ?> tmUpsSpec;

    @FXML
    private TableColumn<?, ?> tmUpsSupId;

    @FXML
    private TableColumn<?, ?> tmUpsYear;

    @FXML
    private TableColumn<?, ?> tmWeelBrand;

    @FXML
    private TableColumn<?, ?> tmWeelDate;

    @FXML
    private TableColumn<?, ?> tmWeelId;

    @FXML
    private TableColumn<?, ?> tmWeelModel;

    @FXML
    private TableColumn<?, ?> tmWeelPrice;

    @FXML
    private TableColumn<?, ?> tmWeelSpec;

    @FXML
    private TableColumn<?, ?> tmWeelSupId;

    @FXML
    private TableColumn<?, ?> tmWeelType;

    @FXML
    private TableColumn<?, ?> tmWeelYear;

    @FXML
    private TableColumn<?, ?> tmWheelQty;

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtGpuBrand;

    @FXML
    private DatePicker txtGpuDate;

    @FXML
    private TextField txtGpuId;

    @FXML
    private TextField txtGpuModelNo;

    @FXML
    private TextField txtGpuPrice;

    @FXML
    private TextField txtGpuQty;

    @FXML
    private JFXTextArea txtGpuSpec;

    @FXML
    private TextField txtGpuSupId;

    @FXML
    private JFXComboBox<String> txtGpuType;

    @FXML
    private TextField txtGpuYear;

    @FXML
    private TextField txtLapBrand;

    @FXML
    private DatePicker txtLapDate;

    @FXML
    private TextField txtLapId;

    @FXML
    private TextField txtLapModelNo;

    @FXML
    private TextField txtLapPrice;

    @FXML
    private TextField txtLapQty;

    @FXML
    private JFXTextArea txtLapSpec;

    @FXML
    private JFXComboBox<String> txtLapType;

    @FXML
    private TextField txtLapYear;

    @FXML
    private TextField txtLapsupName;

    @FXML
    private DatePicker txtRamDate;

    @FXML
    private TextField txtRamId;

    @FXML
    private TextField txtRamModel;

    @FXML
    private TextField txtRamPrice;

    @FXML
    private TextField txtRamQty;

    @FXML
    private JFXTextArea txtRamSpec;

    @FXML
    private TextField txtRamSupId;

    @FXML
    private JFXComboBox<String> txtRamType;

    @FXML
    private TextField txtRamYear;

    @FXML
    private TextField upsBrand;

    @FXML
    private DatePicker upsDate;

    @FXML
    private TextField upsId;

    @FXML
    private TextField upsModel;

    @FXML
    private TextField upsPrice;

    @FXML
    private TextField upsQty;

    @FXML
    private JFXTextArea upsSpec;

    @FXML
    private TextField upsSupId;

    @FXML
    private JFXComboBox<String> upsType;

    @FXML
    private TextField upsYear;

    @FXML
    private TextField weelDate;

    @FXML
    private TextField weelMode;

    @FXML
    private TextField weelYear;

    @FXML
    private TextField wheelBrrand;

    @FXML
    private DatePicker wheelDate;

    @FXML
    private TextField wheelId;

    @FXML
    private TextField wheelPrice;

    @FXML
    private JFXTextArea wheelSpec;

    @FXML
    private TextField wheelSupId;

    @FXML
    private JFXComboBox<String> wheelType;

    private final String[] ty = {"Brand New", "Use"};


    @FXML
    void accAddOnAction(ActionEvent event) {
        String id = AccId.getText();
        String brand = AccBrand.getText();
        String modelno = AccModel.getText();
        String year = AccYear.getText();
        double price = Double.parseDouble(AccPrice.getText());
        String spec = AccSpec.getText();
        String supid = AccSupId.getText();
        Date date = Date.valueOf(AccDate.getValue());
        int qty = Integer.parseInt(AccQty.getText());
        String type = AccType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.accAdd(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void accDeleteOnAction(ActionEvent event) {
        String id = AccId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.accDelete(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void accListOnAction(ActionEvent event) {

    }

    @FXML
    void accUpdateOnAction(ActionEvent event) {
        String id = AccId.getText();
        String brand = AccBrand.getText();
        String modelno = AccModel.getText();
        String year = AccYear.getText();
        double price = Double.parseDouble(AccPrice.getText());
        String spec = AccSpec.getText();
        String supid = AccSupId.getText();
        Date date = Date.valueOf(AccDate.getValue());
        int qty = Integer.parseInt(AccQty.getText());
        String type = AccType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.accUpdate(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllacc(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.accGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            AccessoriesTm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void chAddOnAction(ActionEvent event) {
        String id = chID.getText();
        String brand = chBrand.getText();
        String modelno = chModel.getText();
        String year = chYear.getText();
        double price = Double.parseDouble(chPrice.getText());
        String spec = chSpec.getText();
        String supid = chSupid.getText();
        Date date = Date.valueOf(chDate.getValue());
        int qty = Integer.parseInt(chQty.getText());
        String type = chType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.chAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void chDeleteOnAction(ActionEvent event) {
        String id = chID.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.chDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void chListOnAction(ActionEvent event) {

    }

    @FXML
    void chUpdateOnAction(ActionEvent event) {
        String id = chID.getText();
        String brand = chBrand.getText();
        String modelno = chModel.getText();
        String year = chYear.getText();
        double price = Double.parseDouble(chPrice.getText());
        String spec = chSpec.getText();
        String supid = chSupid.getText();
        Date date = Date.valueOf(chDate.getValue());
        int qty = Integer.parseInt(chQty.getText());
        String type = chType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.chUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllch(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.chGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            CHtm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void gpuAddOnAction(ActionEvent event) {
        String id = txtGpuId.getText();
        String brand = txtGpuBrand.getText();
        String modelno = txtGpuModelNo.getText();
        String year = txtGpuYear.getText();
        double price = Double.parseDouble(txtGpuPrice.getText());
        String spec = txtGpuSpec.getText();
        String supid = txtGpuSupId.getText();
        Date date = Date.valueOf(txtGpuDate.getValue());
        int qty = Integer.parseInt(txtGpuQty.getText());
        String type = txtGpuType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.gpuAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void gpuDeleteOnAction(ActionEvent event) {
        String id = txtGpuId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.gpuDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void gpuListOnAction(ActionEvent event) {

    }


    @FXML
    void gpuUpdateOnAction(ActionEvent event) {
        String id = txtGpuId.getText();
        String brand = txtGpuBrand.getText();
        String modelno = txtGpuModelNo.getText();
        String year = txtGpuYear.getText();
        double price = Double.parseDouble(txtGpuPrice.getText());
        String spec = txtGpuSpec.getText();
        String supid = txtGpuSupId.getText();
        Date date = Date.valueOf(txtGpuDate.getValue());
        int qty = Integer.parseInt(txtGpuQty.getText());
        String type = txtGpuType.getValue();

        var dto = new ItemDto(id, brand, modelno, year, price, spec, supid, date, qty, type);

        try {
            boolean isSave = ItemModel.gpuUpdateOnAction(dto);

            if (isSave) {
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllgpu(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.gpuGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            Gputm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void lapAddOnAction(ActionEvent event) {
        String id = txtLapId.getText();
        String brand = txtLapBrand.getText();
        String modelno = txtLapModelNo.getText();
        String year = txtLapYear.getText();
        double price = Double.parseDouble(txtLapPrice.getText());
        String spec = txtLapSpec.getText();
        String supid = txtLapsupName.getText();
        Date date = Date.valueOf(txtLapDate.getValue());
        int qty = Integer.parseInt(txtLapQty.getText());
        String type = txtLapType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.lapAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void lapDeleteOnAction(ActionEvent event) {
        String id = txtLapId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.lapDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void lapGetListOnAction(ActionEvent event) {

    }

    @FXML
    void lapUpdateOnAction(ActionEvent event) {
        String id = txtLapId.getText();
        String brand = txtLapBrand.getText();
        String modelno = txtLapModelNo.getText();
        String year = txtLapYear.getText();
        double price = Double.parseDouble(txtLapPrice.getText());
        String spec = txtLapSpec.getText();
        String supid = txtLapsupName.getText();
        Date date = Date.valueOf(txtLapDate.getValue());
        int qty = Integer.parseInt(txtLapQty.getText());
        String type = txtLapType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.lapUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAlllap(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.lapGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            LapToptm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void mbAddOnAction(ActionEvent event) {
        String id = MBId.getText();
        String brand = MbBrand.getText();
        String modelno = MBmodelNo.getText();
        String year = MByear.getText();
        double price = Double.parseDouble(MBprice.getText());
        String spec = MBspec.getText();
        String supid = MBsupID.getText();
        Date date = Date.valueOf(MBDate.getValue());
        int qty = Integer.parseInt(MBqTy.getText());
        String type = MBtype.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.mbAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void mbDeleteOnAction(ActionEvent event) {
        String id = MBId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.mbDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void mbListOnAction(ActionEvent event) {

    }

    @FXML
    void mbUpdateOnAction(ActionEvent event) {
        String id = MBId.getText();
        String brand = MbBrand.getText();
        String modelno = MBmodelNo.getText();
        String year = MByear.getText();
        double price = Double.parseDouble(MBprice.getText());
        String spec = MBspec.getText();
        String supid = MBsupID.getText();
        Date date = Date.valueOf(MBDate.getValue());
        int qty = Integer.parseInt(MBqTy.getText());
        String type = MBtype.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.mbUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllmb(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.mbGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            MBtm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void moniListAction(ActionEvent event) {

    }

    @FXML
    void monitorAddOnAction(ActionEvent event) {
        String id = moniID.getText();
        String brand = moniBrand.getText();
        String modelno = moniModel.getText();
        String year = moniYear.getText();
        double price = Double.parseDouble(moniPrice.getText());
        String spec = moniSpec.getText();
        String supid = moniSupID.getText();
        Date date = Date.valueOf(moniDate.getValue());
        int qty = Integer.parseInt(moniQty.getText());
        String type = moniType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.monitorAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void monitorDeteleOnAction(ActionEvent event) {
        String id = moniID.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.monitorDeteleOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void monitorUpdateOnAction(ActionEvent event) {
        String id = moniID.getText();
        String brand = moniBrand.getText();
        String modelno = moniModel.getText();
        String year = moniYear.getText();
        double price = Double.parseDouble(moniPrice.getText());
        String spec = moniSpec.getText();
        String supid = moniSupID.getText();
        Date date = Date.valueOf(moniDate.getValue());
        int qty = Integer.parseInt(moniQty.getText());
        String type = moniType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.monitorUpdateOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllmoni(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.moniGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            moniTm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void otherAddOnAction(ActionEvent event) {
        String id = otherid.getText();
        String brand = otherBrand.getText();
        String modelno = otherModel.getText();
        String year = odherYear.getText();
        double price = Double.parseDouble(otherPrice.getText());
        String spec = otherSpec.getText();
        String supid = otherSupId.getText();
        Date date = Date.valueOf(otherDate.getValue());
        int qty = Integer.parseInt(otherQty.getText());
        String type = otherType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.otherAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void otherDeleteOnAction(ActionEvent event) {
        String id = otherid.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.otherDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void otherListOnAction(ActionEvent event) {

    }

    @FXML
    void otherUpdateOnAction(ActionEvent event) {
        String id = otherid.getText();
        String brand = otherBrand.getText();
        String modelno = otherModel.getText();
        String year = odherYear.getText();
        double price = Double.parseDouble(otherPrice.getText());
        String spec = otherSpec.getText();
        String supid = otherSupId.getText();
        Date date = Date.valueOf(otherDate.getValue());
        int qty = Integer.parseInt(otherQty.getText());
        String type = otherType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.otherUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllother(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.otherGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            OtherTM.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void ramAddOnAction(ActionEvent event) {
        String id = txtRamId.getText();
        String brand = txtBrand.getText();
        String modelno = txtRamModel.getText();
        String year = txtRamYear.getText();
        double price = Double.parseDouble(txtRamPrice.getText());
        String spec = txtRamSpec.getText();
        String supid = txtRamSupId.getText();
        Date date = Date.valueOf(txtRamDate.getValue());
        int qty = Integer.parseInt(txtRamQty.getText());
        String type = txtRamType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.ramAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Acc Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Acc is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void ramDeleteOnAction(ActionEvent event) {
        String id = txtRamId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.ramDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void ramListOnAction(ActionEvent event) {

    }

    @FXML
    void ramUpdateOnAction(ActionEvent event) {
        String id = txtRamId.getText();
        String brand = txtBrand.getText();
        String modelno = txtRamModel.getText();
        String year = txtRamYear.getText();
        double price = Double.parseDouble(txtRamPrice.getText());
        String spec = txtRamSpec.getText();
        String supid = txtRamSupId.getText();
        Date date = Date.valueOf(txtRamDate.getValue());
        int qty = Integer.parseInt(txtRamQty.getText());
        String type = txtRamType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.ramUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllram(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.ramGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            Ramtm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void storageAddOnAction(ActionEvent event) {
        String id = stoID.getText();
        String brand = stoBrand.getText();
        String modelno = stoModel.getText();
        String year = stoYear.getText();
        double price = Double.parseDouble(stoPrice.getText());
        String spec = stoSpec.getText();
        String supid = stoSupID.getText();
        Date date = Date.valueOf(stoDate.getValue());
        int qty = Integer.parseInt(stoQty.getText());
        String type = stoType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.storageAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Acc Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Acc is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void storageDeleteOnAction(ActionEvent event) {
        String id = stoID.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.storageDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void storageListOnAction(ActionEvent event) {

    }

    @FXML
    void storageUpdateOnAction(ActionEvent event) {
        String id = stoID.getText();
        String brand = stoBrand.getText();
        String modelno = stoModel.getText();
        String year = stoYear.getText();
        double price = Double.parseDouble(stoPrice.getText());
        String spec = stoSpec.getText();
        String supid = stoSupID.getText();
        Date date = Date.valueOf(stoDate.getValue());
        int qty = Integer.parseInt(stoQty.getText());
        String type = stoType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.storageUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Storage is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Storage is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllstorage(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.storageGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            storageTM.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void upsAddOnAction(ActionEvent event) {
        String id = upsId.getText();
        String brand = upsBrand.getText();
        String modelno = upsModel.getText();
        String year = upsYear.getText();
        double price = Double.parseDouble(upsPrice.getText());
        String spec = upsSpec.getText();
        String supid = upsSupId.getText();
        Date date = Date.valueOf(upsDate.getValue());
        int qty = Integer.parseInt(upsQty.getText());
        String type = upsType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.upsAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Acc Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Acc is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void upsDeleteOnAction(ActionEvent event) {
        String id = upsId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.upsDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void upsListOnAction(ActionEvent event) {

    }

    @FXML
    void upsUpdateOnAction(ActionEvent event) {
        String id = upsId.getText();
        String brand = upsBrand.getText();
        String modelno = upsModel.getText();
        String year = upsYear.getText();
        double price = Double.parseDouble(upsPrice.getText());
        String spec = upsSpec.getText();
        String supid = upsSupId.getText();
        Date date = Date.valueOf(upsDate.getValue());
        int qty = Integer.parseInt(upsQty.getText());
        String type = upsType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.upsUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Ups is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Ups is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllups(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.upsGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            UPStm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void wheelAddOnAction(ActionEvent event) {
        String id = wheelId.getText();
        String brand = wheelBrrand.getText();
        String modelno = weelMode.getText();
        String year = weelYear.getText();
        double price = Double.parseDouble(wheelPrice.getText());
        String spec = wheelSpec.getText();
        String supid = wheelSupId.getText();
        Date date = Date.valueOf(wheelDate.getValue());
        int qty = Integer.parseInt(wheelQty.getText());
        String type = wheelType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.wheelAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Acc Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Acc is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void wheelDeleteOnAction(ActionEvent event) {
        String id = wheelId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.wheelDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void wheelList(ActionEvent event) {

    }


    @FXML
    void wheelUpdateOnAction(ActionEvent event) {
        String id = wheelId.getText();
        String brand = wheelBrrand.getText();
        String modelno = weelMode.getText();
        String year = weelYear.getText();
        double price = Double.parseDouble(wheelPrice.getText());
        String spec = wheelSpec.getText();
        String supid = wheelSupId.getText();
        Date date = Date.valueOf(wheelDate.getValue());
        int qty = Integer.parseInt(wheelQty.getText());
        String type = wheelType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isUpdate = ItemModel.wheelUpdateOnAction(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Wheel is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Wheel is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllwheel(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.wheelGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            wheelTm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void setCellValueFactoryaACC(){
        tmAccId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmAccBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmAccModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmAccYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmAccPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmAccspec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmAccSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmAccDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmAccQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmAccType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryaLap(){
        tmLapId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmLapBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmLapModelNo.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmLapYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmLapPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmLapSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmLapSupName.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmLapDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmLapQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmLapType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryaGpu(){
        tmGpuId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmGpuBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmGpuModelNo.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmGpuYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmGpuPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmGpuSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmGpuSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmGpuDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmGpuQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmGpuType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryaRam(){
        tmRamId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmRamBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmRamModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmRamYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmRamPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmRamSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmRamSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmRamDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmRamType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }

    private void setCellValueFactoryaMB(){
        tmMBid.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmMBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmMBmodelNo.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmMByear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmMBprice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmMbspec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmMBsupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmMBdate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmMBqty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmMBtype.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryaCasing(){
        tmCasingId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmCasingBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmCasingModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmCasingYer.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmCasingPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmCasingSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmCasingSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmCasingDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmCasingQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmCasingType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }

    private void setCellValueFactoryaMonitor(){
        tmMoniID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmMoniBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmMoniModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmMoniYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmMoniPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmMoniSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmMoniSupID.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmCasingDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmCasingQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmCasingType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryaStorage(){
        tmStoID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmStoBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmStoModelNo.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmStoYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmStoPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmStoSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmStoSupID.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmStoDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmStoQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmStoType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryCH(){
        tmCHid.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmChBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmChModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmChYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmChPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmChSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmChSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmChDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmChQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmChType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryWheel(){
        tmWeelId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmWeelBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmWeelModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmWeelYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmWeelPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmWeelSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmWeelSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmWeelDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmWheelQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmWeelType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryPowerSup(){
        tmUpsId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmUpsBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmUpsModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmUpsYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmUpsPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmUpsSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmUpsSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmUpsDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmUpsQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmUPStype.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    private void setCellValueFactoryOther(){
        tmOtherID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmOtherBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmOtherModel.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmOtherYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmOtherPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmOtherSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmOtherSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmOtherDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmOtherQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmOtherType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setCellValueFactoryaACC();
        setCellValueFactoryaLap();
        setCellValueFactoryaGpu();
        setCellValueFactoryaRam();
        setCellValueFactoryaMB();
        setCellValueFactoryaCasing();
        setCellValueFactoryaMonitor();
        setCellValueFactoryaStorage();
        setCellValueFactoryCH();
        setCellValueFactoryWheel();
        setCellValueFactoryPowerSup();
        setCellValueFactoryOther();
        loadAllacc();
        loadAllch();
        loadAllgpu();
        loadAlllap();
        loadAllmb();
        loadAllmoni();
        loadAllother();
        loadAllram();
        loadAllstorage();
        loadAllups();
        loadAllwheel();
        loadAllcasing();
        AccType.getItems().addAll(ty);
        chType.getItems().addAll(ty);
        txtLapType.getItems().addAll(ty);
        txtGpuType.getItems().addAll(ty);
        txtRamType.getItems().addAll(ty);
        MBtype.getItems().addAll(ty);
        CasType.getItems().addAll(ty);
        moniType.getItems().addAll(ty);
        stoType.getItems().addAll(ty);
        wheelType.getItems().addAll(ty);
        upsType.getItems().addAll(ty);
        otherType.getItems().addAll(ty);

    }


    public void casingAddOnAction(ActionEvent actionEvent) {
        String id = CasId.getText();
        String brand = CasBrand.getText();
        String modelno = CasModel.getText();
        String year = Casyear.getText();
        double price = Double.parseDouble(CasPrice.getText());
        String spec = Casspec.getText();
        String supid = wheelSupId.getText();
        Date date = Date.valueOf(wheelDate.getValue());
        int qty = Integer.parseInt(wheelQty.getText());
        String type = wheelType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.casingAddOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Save .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void casingListOnAction(ActionEvent actionEvent) {

    }

    public void casingUpdateOnAction(ActionEvent actionEvent) {
        String id = CasId.getText();
        String brand = CasBrand.getText();
        String modelno = CasModel.getText();
        String year = Casyear.getText();
        double price = Double.parseDouble(CasPrice.getText());
        String spec = Casspec.getText();
        String supid = wheelSupId.getText();
        Date date = Date.valueOf(wheelDate.getValue());
        int qty = Integer.parseInt(wheelQty.getText());
        String type = wheelType.getValue();

        var dto = new ItemDto(id,brand,modelno,year,price,spec,supid,date,qty,type);

        try {
            boolean isSave = ItemModel.casingUpdateOnAction(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION,"Item is Update .");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void casingDeleteOnAction(ActionEvent actionEvent) {
        String id = CasId.getText();

        ItemDto dto = new ItemDto(id);

        try{
            boolean isDelete = ItemModel.casingDeleteOnAction(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void loadAllcasing(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try{
            List<ItemDto> dtoList = model.casingGetAll();

            for (ItemDto dto : dtoList){
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()

                ));
            }
            CasingTm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
