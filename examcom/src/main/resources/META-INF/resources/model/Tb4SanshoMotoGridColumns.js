/**
 * 参照元グリッド定義
 */

let Tb4SanshoMotoGridColumns = [];

$(function() {
    Tb4SanshoMotoGridColumns = [
        Column.text('SANSHO_MOTO_ID', Messages['Tb4SanshoMotoGrid.sanshoMotoId'], 90, 'primaryKey numbering', null),
        Column.refer('IDSANSHO_ID', Messages['Tb4SanshoMotoGrid.idsanshoId'], 90, '', 'IDSANSHO_MEI'),
        Column.text('IDSANSHO_MEI', Messages['Tb4SanshoMotoGrid.idsanshoMei'], 300, '', null),
        Column.refer('CDSANSHO_CD', Messages['Tb4SanshoMotoGrid.cdsanshoCd'], 90, '', 'CDSANSHO_MEI'),
        Column.text('CDSANSHO_MEI', Messages['Tb4SanshoMotoGrid.cdsanshoMei'], 300, '', null),
        Column.refer('NOSANSHO_NO', Messages['Tb4SanshoMotoGrid.nosanshoNo'], 90, '', 'NOSANSHO_MEI'),
        Column.text('NOSANSHO_MEI', Messages['Tb4SanshoMotoGrid.nosanshoMei'], 300, '', null),
        Column.refer('BETSU_IDSANSHO_ID', Messages['Tb4SanshoMotoGrid.betsuIdsanshoId'], 90, '', 'BETSU_IDSANSHO_MEI'),
        Column.cell('UPDATE_TS', Messages['Tb4SanshoMotoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
