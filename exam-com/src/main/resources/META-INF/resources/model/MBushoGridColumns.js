/**
 * 部署マスタグリッド定義
 */

let MBushoGridColumns = [
    Column.comma('BUSHO_ID', Messages['MBushoGrid.bushoId'], 150, 'primaryKey numbering', null),
    Column.text('BUSHO_MEI', Messages['MBushoGrid.bushoMei'], 300, '', null),
    Column.refer('OYA_BUSHO_ID', Messages['MBushoGrid.oyaBushoId'], 150, '', 'null'),
    Column.date('KAISHI_BI', Messages['MBushoGrid.kaishiBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.date('SHURYO_BI', Messages['MBushoGrid.shuryoBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_DT', Messages['MBushoGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MBushoGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MBushoGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MBushoGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MBushoGrid.deleteF'], 30, ''),
];
