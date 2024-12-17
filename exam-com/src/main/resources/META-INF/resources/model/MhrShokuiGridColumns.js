/**
 * 職位マスタグリッド定義
 */

let MhrShokuiGridColumns = [
    Column.comma('SHOKUI_ID', Messages['MhrShokuiGrid.shokuiId'], 80, 'primaryKey numbering', null),
    Column.text('SHOKUI_MEI', Messages['MhrShokuiGrid.shokuiMei'], 300, '', null),
    Column.comma('SHOKUI_ON', Messages['MhrShokuiGrid.shokuiOn'], 80, '', null),
    Column.date('KAISHI_BI', Messages['MhrShokuiGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrShokuiGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MhrShokuiGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MhrShokuiGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MhrShokuiGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MhrShokuiGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrShokuiGrid.deleteF'], 30, ''),
];
