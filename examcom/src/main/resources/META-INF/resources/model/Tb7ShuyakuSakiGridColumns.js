/**
 * 集約先グリッド定義
 */

let Tb7ShuyakuSakiGridColumns = [];

$(function() {
    Tb7ShuyakuSakiGridColumns = [
        Column.text('SHUYAKU_SAKI_ID', Messages['Tb7ShuyakuSakiGrid.shuyakuSakiId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_SAKI_INFO', Messages['Tb7ShuyakuSakiGrid.shuyakuSakiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ShuyakuSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
