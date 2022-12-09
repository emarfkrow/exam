/**
 * 部署マスタグリッド定義
 */

let MBushoGridColumns = [
    Column.comma('BUSHO_ID', Messages['MBushoGrid.bushoId'], 150, 'primaryKey numbering', null),
    Column.text('BUSHO_MEI', Messages['MBushoGrid.bushoMei'], 300, '', null),
    Column.date('KAISHI_YMD', Messages['MBushoGrid.kaishiYmd'], 150, '', null),
    Column.date('SHURYO_YMD', Messages['MBushoGrid.shuryoYmd'], 150, '', null),
    Column.refer('OYA_BUSHO_ID', Messages['MBushoGrid.oyaBushoId'], 150, '', 'null'),
    Column.cell('INSERT_DT', Messages['MBushoGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MBushoGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MBushoGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MBushoGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MBushoGrid.deleteF'], 30, ''),
];
