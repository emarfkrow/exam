/**
 * 集約元グリッド定義
 */

let Tb6ShuyakuMotoGridColumns = [];

$(function() {
    Tb6ShuyakuMotoGridColumns = [
        Column.text('SHUYAKU_MOTO_ID', Messages['Tb6ShuyakuMotoGrid.shuyakuMotoId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_MOTO_INFO', Messages['Tb6ShuyakuMotoGrid.shuyakuMotoInfo'], 300, '', null),
        Column.text('SHUYAKU_SAKI_ID', Messages['Tb6ShuyakuMotoGrid.shuyakuSakiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
