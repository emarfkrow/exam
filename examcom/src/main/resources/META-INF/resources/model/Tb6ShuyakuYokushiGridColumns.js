/**
 * 集約抑止グリッド定義
 */

let Tb6ShuyakuYokushiGridColumns = [];

$(function() {
    Tb6ShuyakuYokushiGridColumns = [
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb6ShuyakuYokushiGrid.shuyakuYokushiId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_INFO', Messages['Tb6ShuyakuYokushiGrid.shuyakuYokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuYokushiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
