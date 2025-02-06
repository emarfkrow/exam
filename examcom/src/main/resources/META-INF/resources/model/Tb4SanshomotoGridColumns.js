/**
 * 参照元グリッド定義
 */

let Tb4SanshoMotoGridColumns = [];

$(function() {
    Tb4SanshoMotoGridColumns = [
        Column.comma('SANSHO_MOTO_ID', Messages['Tb4SanshoMotoGrid.sanshoMotoId'], 80, 'primaryKey numbering', null),
        Column.refer('IDSANSHO_ID', Messages['Tb4SanshoMotoGrid.idsanshoId'], 80, '', 'IDSANSHO_MEI'),
        Column.text('IDSANSHO_MEI', Messages['Tb4SanshoMotoGrid.idsanshoMei'], 300, '', null),
        Column.refer('CDSANSHO_CD', Messages['Tb4SanshoMotoGrid.cdsanshoCd'], 80, '', 'CDSANSHO_MEI'),
        Column.text('CDSANSHO_MEI', Messages['Tb4SanshoMotoGrid.cdsanshoMei'], 300, '', null),
        Column.refer('NOSANSHO_NO', Messages['Tb4SanshoMotoGrid.nosanshoNo'], 80, '', 'NOSANSHO_MEI'),
        Column.text('NOSANSHO_MEI', Messages['Tb4SanshoMotoGrid.nosanshoMei'], 300, '', null),
        Column.refer('BETSU_IDSANSHO_ID', Messages['Tb4SanshoMotoGrid.betsuIdsanshoId'], 80, '', 'BETSU_IDSANSHO_MEI'),
        Column.cell('UPDATE_TS', Messages['Tb4SanshoMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb4SanshoMotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb4SanshoMotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
