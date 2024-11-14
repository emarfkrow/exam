/**
 * 職位マスタグリッド定義
 */

let MShokuiGridColumns = [
    Column.comma('SHOKUI_ID', Messages['MShokuiGrid.shokuiId'], 150, 'primaryKey numbering', null),
    Column.text('SHOKUI_MEI', Messages['MShokuiGrid.shokuiMei'], 300, '', null),
    Column.comma('SHOKUI_ON', Messages['MShokuiGrid.shokuiOn'], 150, '', null),
    Column.date('KAISHI_BI', Messages['MShokuiGrid.kaishiBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.date('SHURYO_BI', Messages['MShokuiGrid.shuryoBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_DT', Messages['MShokuiGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShokuiGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShokuiGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShokuiGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShokuiGrid.deleteF'], 30, ''),
];
