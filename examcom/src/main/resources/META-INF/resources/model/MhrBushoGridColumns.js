/**
 * 部署マスタグリッド定義
 */

let MhrBushoGridColumns = [
    Column.comma('BUSHO_ID', Messages['MhrBushoGrid.bushoId'], 80, 'primaryKey numbering', null),
    Column.text('BUSHO_MEI', Messages['MhrBushoGrid.bushoMei'], 300, 'notblank', null),
    Column.refer('OYA_BUSHO_ID', Messages['MhrBushoGrid.oyaBushoId'], 80, '', 'null'),
    Column.date('KAISHI_BI', Messages['MhrBushoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrBushoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MhrBushoGrid.deleteF'], 30, ''),
];
