/**
 * 集約抑止グリッド定義
 */

let Tb7ShuyakuYokushiGridColumns = [];

$(function() {
    Tb7ShuyakuYokushiGridColumns = [
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb7ShuyakuYokushiGrid.shuyakuYokushiId'], 90, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_INFO', Messages['Tb7ShuyakuYokushiGrid.shuyakuYokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ShuyakuYokushiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
