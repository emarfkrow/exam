/**
 * 添付ファイルグリッド定義
 */

let Tb1TenpuFileGridColumns = [];

$(function() {
    Tb1TenpuFileGridColumns = [
        Column.comma('SOSEN_ID', Messages['Tb1TenpuFileGrid.sosenId'], 80, 'primaryKey numbering', null),
        Column.comma('OYA_BN', Messages['Tb1TenpuFileGrid.oyaBn'], 80, 'primaryKey numbering', null),
        Column.comma('ENTITY_BN', Messages['Tb1TenpuFileGrid.entityBn'], 80, 'primaryKey numbering', null),
        Column.comma('TENPU_FILE_BN', Messages['Tb1TenpuFileGrid.tenpuFileBn'], 80, 'primaryKey numbering', null),
        Column.text('TENPU_FILE_MEI', Messages['Tb1TenpuFileGrid.tenpuFileMei'], 300, 'notblank', null),
        Column.link('TENPU_FILE_PATH', Messages['Tb1TenpuFileGrid.tenpuFilePath'], 300, 'notblank'),
        Column.cell('UPDATE_TS', Messages['Tb1TenpuFileGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1TenpuFileGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1TenpuFileGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
