/**
 * 職位マスタグリッド定義
 */

let MShokuiGridColumns = [
    Column.comma('SHOKUI_ID', Messages['MShokuiGrid.shokuiId'], 150, 'primaryKey numbering', null),
    Column.text('SHOKUI_MEI', Messages['MShokuiGrid.shokuiMei'], 300, '', null),
    Column.comma('ORDER_ID', Messages['MShokuiGrid.orderId'], 150, '', null),
    Column.date('KAISHI_YMD', Messages['MShokuiGrid.kaishiYmd'], 150, '', null),
    Column.date('SHURYO_YMD', Messages['MShokuiGrid.shuryoYmd'], 150, '', null),
    Column.cell('INSERT_DT', Messages['MShokuiGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShokuiGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShokuiGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShokuiGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShokuiGrid.deleteF'], 30, ''),
];
