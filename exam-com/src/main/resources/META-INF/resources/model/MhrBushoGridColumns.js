/**
 * 部署マスタグリッド定義
 */

let MhrBushoGridColumns = [
    Column.comma('BUSHO_ID', Messages['MhrBushoGrid.bushoId'], 80, 'primaryKey numbering', null),
    Column.text('BUSHO_MEI', Messages['MhrBushoGrid.bushoMei'], 300, '', null),
    Column.refer('OYA_BUSHO_ID', Messages['MhrBushoGrid.oyaBushoId'], 80, '', 'null'),
    Column.date('KAISHI_BI', Messages['MhrBushoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrBushoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MhrBushoGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MhrBushoGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MhrBushoGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MhrBushoGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrBushoGrid.deleteF'], 30, ''),
];
