/**
 * 集約元グリッド定義
 */

let Tb7ShuyakuMotoGridColumns = [];

$(function() {
    Tb7ShuyakuMotoGridColumns = [
        Column.text('SHUYAKU_MOTO_ID', Messages['Tb7ShuyakuMotoGrid.shuyakuMotoId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_MOTO_INFO', Messages['Tb7ShuyakuMotoGrid.shuyakuMotoInfo'], 300, '', null),
        Column.cell('SHUYAKU_SAKI_ID', Messages['Tb7ShuyakuMotoGrid.shuyakuSakiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ShuyakuMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
