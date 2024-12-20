/**
 * 職位マスタグリッド定義
 */

let MhrShokuiGridColumns = [
    Column.comma('SHOKUI_ID', Messages['MhrShokuiGrid.shokuiId'], 80, 'primaryKey numbering', null),
    Column.text('SHOKUI_MEI', Messages['MhrShokuiGrid.shokuiMei'], 300, 'notblank', null),
    Column.comma('SHOKUI_ON', Messages['MhrShokuiGrid.shokuiOn'], 80, 'notblank', null),
    Column.date('KAISHI_BI', Messages['MhrShokuiGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrShokuiGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MhrShokuiGrid.deleteF'], 30, ''),
];
